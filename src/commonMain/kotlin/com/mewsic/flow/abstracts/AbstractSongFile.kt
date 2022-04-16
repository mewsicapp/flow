package com.mewsic.flow.abstracts

abstract class AbstractSongFile {
    abstract val url: String
    abstract val lengthSeconds: Int
    abstract val bitrate: Int
//    abstract val format: String
} // might use format later, but for now it's not needed
