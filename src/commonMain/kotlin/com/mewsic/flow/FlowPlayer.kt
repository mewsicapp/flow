package com.mewsic.flow

import androidx.compose.runtime.MutableState
import com.mewsic.flow.abstracts.AbstractFlowPlayer
import com.mewsic.flow.abstracts.AbstractFlowQueue
import com.mewsic.flow.abstracts.AbstractFlowState
import java.net.URI

class FlowPlayer : AbstractFlowPlayer() {
    override val state: MutableState<AbstractFlowState>
        get() = TODO("Not yet implemented")
    override val queue: AbstractFlowQueue
        get() = TODO("Not yet implemented")

    override fun newState(): Pair<AbstractFlowPlayer, MutableState<AbstractFlowState>> {
        TODO("Not yet implemented")
    }

    override fun play(url: URI) {
        TODO("Not yet implemented")
    }

    override fun play(path: String) {
        TODO("Not yet implemented")
    }

    override fun play(data: ByteArray) {
        TODO("Not yet implemented")
    }

}
