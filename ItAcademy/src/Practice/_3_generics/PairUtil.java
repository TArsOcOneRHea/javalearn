package Practice._3_generics;

public class PairUtil {
    public PairUtil() {
    }

    public static <V, K> Pair<V, K> swap (Pair<K, V> pair){
        return new Pair<>(pair.getValue(),pair.getKey());
    }
}
