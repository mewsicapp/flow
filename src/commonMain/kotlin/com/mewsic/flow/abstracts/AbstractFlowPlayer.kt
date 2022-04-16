package com.mewsic.flow.abstracts
import androidx.compose.runtime.MutableState
import com.mewsic.flow.enums.RepeatState
import java.net.URI

abstract class AbstractFlowPlayer {
    abstract val state: MutableState<AbstractFlowState>
    abstract val queue: AbstractFlowQueue

    // settings, getter and setter both use `state` to get the same value
    var repeatState: RepeatState
        get() = state.value.repeatState
        set(value) { state.value.repeatState = value }
    var shuffle: Boolean
        get() = state.value.shuffle
        set(value) {
            if (value) {
                state.value.shuffle = true
                queue.shuffle()
            } else {
                state.value.shuffle = false
                queue.unshuffle()
            }
        }





    abstract fun newState(): Pair<AbstractFlowPlayer, MutableState<AbstractFlowState>>

    abstract fun play(url: URI)
    abstract fun play(path: String)
    abstract fun play(data: ByteArray)

}
