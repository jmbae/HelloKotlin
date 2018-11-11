package main.class09

interface WriteRepo<in T> {
    fun save(obj: T)
    fun saveAll(list: List<T>)
}