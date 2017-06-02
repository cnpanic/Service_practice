package arabiannight.tistory.com.service;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.util.Log;

public class ServiceClass extends Service{
	
	private MediaPlayer mPlayer = null;

	@Override
	public IBinder onBind(Intent intent) {
		return null;
	}
	
	@Override
	public void onStart(Intent intent, int startId) {
		Log.d("slog", "onStart()");
		super.onStart(intent, startId); 
		// raw에 재생할 mp3를 넣어 주세요.
		mPlayer = MediaPlayer.create(this, R.raw.goaway);
		mPlayer.start();
	}
	
	@Override
	public void onDestroy() { 
		Log.d("slog", "onDestroy()");
		mPlayer.stop();
		super.onDestroy();
	}
}
