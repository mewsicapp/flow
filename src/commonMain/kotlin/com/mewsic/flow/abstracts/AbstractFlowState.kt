package com.mewsic.flow.abstracts

import com.mewsic.flow.enums.RepeatState

abstract class AbstractFlowState {
    abstract var repeatState: RepeatState
    abstract var shuffle: Boolean
}
