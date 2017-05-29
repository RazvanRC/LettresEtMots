package fr.razvan.outils;



public class Paire<K,V extends Comparable> implements Comparable {	
	K key;
	V value;
	
	
	public Paire(K key, V value) {
		super();
		this.key = key;
		this.value = value;
	}
	public Paire() {
		super();
		// TODO Auto-generated constructor stub
	}
//	@Override
//	public String toString() {
//		return "Paire [key=" + key + ", value=" + value + "]";
//	}
	public K getKey() {
		return key;
	}
	public void setKey(K key) {
		this.key = key;
	}
	public V getValue() {
		return value;
	}
	public void setValue(V value) {
		this.value = value;
	}
	@Override
	public int compareTo(Object arg0) {
		Paire<K,V> autre = (Paire<K,V>) arg0;
		return autre.getValue().compareTo(this.getValue());
	}

	
}
