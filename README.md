# `com.mewsic.flow`
A universal audio-playing library for Kotlin Multiplatform and JVM, written for and used internally in mewsic

*intended for use in Kotlin Compose projects*

## Features
- **Cross-platform**: Supports Kotlin Multiplatform and JVM, from the same *common* codebase
- **Dynamic**: Supports dynamic playback of audio streams and files alike

## Status
| **Platform** | **Status** |
| --- | --- |
| KMP | **Untested** |
| JVM | **Untested** |

**Uses ExoPlayer in Android for playback, though most other logic is homemade**

## Usage
Simply import the library and go wild!

```kotlin
import com.mewsic.flow.*
// import mutableStateOf for some convenience in many environments
import androidx.lifecycle.mutableStateOf
import your.project.components.*
fun main(args: Array<String>) {
    
    val (flowPlayer, reliableState) = FlowPlayer().newState().also { fP, _ -> // returns a FlowPlayer and a MutableState for playback control
        fP.play(
            "https://link-to-your-audio-file.com/audio.mp3",
        )
        fP.play(
            R.raw.your_audio_file
        )
        fP.queue.reverse() // you have FULL control over the queue, you even have some convenience methods as shown below
    }
    
    player {
        // your player elements, just an example:tm:
        AlbumArt(reliableState)
        TrackDetails(reliableState)
        PlayerTimeShow(reliableState) // changing timePosition in the code also changes the timePosition in the FlowPlayer
        Controls(
            onPlay = { flowPlayer.play() },
            onPause = { flowPlayer.pause() },
            onStop = { flowPlayer.stop() },
            onNext = { flowPlayer.next() },
            onPrevious = { flowPlayer.previous() },
            onShuffle = { flowPlayer.queue.shuffle() },
            onUnshuffle = { flowPlayer.queue.unshuffle() },
            onRepeat = { flowPlayer.setRepeatState(it) }
        )
    }
}
```
