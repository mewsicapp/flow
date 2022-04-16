package com.mewsic.flow.extractors

import com.mewsic.flow.abstracts.AbstractSongManifest

abstract class AbstractExtractor {
    abstract fun can(some: AbstractSongManifest): Boolean
    abstract fun extract(some: AbstractSongManifest): ByteArray
}
