package com.mewsic.flow

import com.mewsic.flow.abstracts.AbstractFlowQueue
import com.mewsic.flow.abstracts.AbstractSongManifest
import com.mewsic.flow.util.shuffledCopyOf

class FlowQueue: AbstractFlowQueue() {
    private val queue: MutableList<AbstractSongManifest> = mutableListOf()
    public var currentQueue: List<AbstractSongManifest> = listOf()
    private var getRandom = false
    override fun shuffle() {
        getRandom = true
//        currentQueue =
    }

    override fun unshuffle() {
        TODO("Not yet implemented")
    }

    override fun insertAt(index: Int, item: AbstractSongManifest) {
        TODO("Not yet implemented")

    }

}
