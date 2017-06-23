package com.ak93.exoplayerexample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

import com.coolsharp.exoplayer.Player;
import com.google.android.exoplayer2.upstream.RawResourceDataSource;

public class MainActivity extends AppCompatActivity {

    private ImageButton btnPlay;
    private boolean isPlaying = false;
    private Player player;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initMediaControls();

    }

    private void initMediaControls() {
        initPlayButton();
    }

    private void initPlayButton() {
        btnPlay = (ImageButton) findViewById(R.id.btnPlay);
        btnPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setPlayPause(!isPlaying);
            }
        });
    }

    /**
     * Starts or stops playback. Also takes care of the Play/Pause button toggling
     * @param play True if playback should be started
     */
    private void setPlayPause(boolean play){
        Player player = new Player(this);

        player.prepareExoPlayerFromRawResourceUri(RawResourceDataSource.buildRawResourceUri(R.raw.audio));

        player.play();

        player = new Player(this);

        player.prepareExoPlayerFromRawResourceUri(RawResourceDataSource.buildRawResourceUri(R.raw.audio));

        player.play();
    }
}
