package com.mewsic.flow.util

fun <T> MutableList<T>.popRandom(): T? {
    if (this.isEmpty()) return null
    val index = (0 until this.size).random()
    return this.removeAt(index)
}

inline fun <reified C : Iterator<I>, I> copyOf(iterator: C): C
    = iterator.asSequence().toList().iterator() as C

inline fun <reified C : Iterator<I>, I> C.shuffledCopyOf(): C
    = this.asSequence().shuffled().toList().iterator() as C
