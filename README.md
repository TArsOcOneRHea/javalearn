# javalearn
CREATE TABLE books
(
  id        SERIAL PRIMARY KEY,
  name      VARCHAR(70),
  genre     VARCHAR(30),
  year      INT,
  id_author INT NOT NULL,
  FOREIGN KEY (id_author) REFERENCES author(id)

);

CREATE TABLE author
(
  id      SERIAL PRIMARY KEY,
  name    VARCHAR(30),
  surname VARCHAR(30),
  country VARCHAR(30)
);

INSERT INTO author (name, surname, country)
VALUES ('Лев', 'Толстой', 'Россия'),
       ('Михаил', 'Булгаков', 'Россия'),
       ('Джек', 'Лондон', 'США'),
       ('Джоан', 'Роулинг', 'Великобритания'),
       ('Дуглас', 'Адамс', 'Сша')
;

INSERT INTO books (name, genre, year, id_author)
VALUES ('Война и мир', 'роман', 1873,1),
       ('Собачье сердце', 'повесть', 1925,2),
       ('Мастер и Маргарита', 'роман', 1928,2),
       ('Мартин Инден', 'драма', 1909,3),
       ('Белый клык', 'повесть', 1906,3),
       ('Гарри Поттер и философский камень', 'фэнтези', 1997,4),
       ('Гарри Поттер и тайная комната', 'фэнтези', 1998,4),
       ('Руководство для путешествующих автостопом по Галактике', 'научная фантастика', 1979,5),
       ('Кавказский пленник', 'рассказ' ,1872,1)
;

SELECT author.name,
       author.surname,
       books.name,
       books.year
FROM author
JOIN books ON author.id = books.id_author
ORDER BY  books.year DESC;

SELECT author.surname,
       author.name,
       COUNT(books.id_author)
FROM author
JOIN books ON author.id = books.id_author
GROUP BY author.surname,  author.name
ORDER BY  COUNT(books.id_author) DESC;
