package com.mewsic.flow.abstracts

abstract class AbstractFlowQueue {
    abstract fun shuffle()
    abstract fun unshuffle()
    abstract fun insertAt(index: Int, item: AbstractSongManifest)
}
