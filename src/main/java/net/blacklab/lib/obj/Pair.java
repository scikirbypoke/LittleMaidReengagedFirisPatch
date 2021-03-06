package net.blacklab.lib.obj;

@SuppressWarnings("unused")
public interface Pair<K, V> {
	
	K getKey();
	Pair<K, V> setKey(K s);
	
	V getValue();
	Pair<K, V> setValue(V v);

}
