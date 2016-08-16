package rimp.rild.com.android.android_piano_sample;

import android.content.Context;
import android.media.AudioManager;
import android.media.SoundPool;

/**
 * Created by rild on 16/08/17.
 */
public class Clap {
    private SoundPool soundPool;
    private int soundId;

    public Clap(Context context) {
        soundPool=new SoundPool(1, AudioManager.STREAM_MUSIC,0);
        soundId=soundPool.load(context,R.raw.sound_chime,1);
    }

    public void play() {
        soundPool.play(soundId, 1.0f, 1.0f, 0, 0, 1.0f);
    }
}
