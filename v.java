// Interface 
interface Playable {
    void play();
    void pause();
    void stop();
}

// Class implementing interface
class VideoPlayer implements Playable {
    private String videoName;
    private boolean isPlaying;
    private long fileSize;
    
    public VideoPlayer(String videoName, long fileSize) {
        this.videoName = videoName;
        this.fileSize = fileSize;
        this.isPlaying = false;
    }
    
    @Override
    public void play() {
        isPlaying = true;
        System.out.println("Playing: " + videoName);
    }
    
    @Override
    public void pause() {
        isPlaying = false;
        System.out.println("Paused: " + videoName);
    }
    
    @Override
    public void stop() {
        isPlaying = false;
        System.out.println("Stopped: " + videoName);
    }
}

class AudioPlayer implements Playable {
    private String songName;
    private String artist;
    
    public AudioPlayer(String songName, String artist) {
        this.songName = songName;
        this.artist = artist;
    }
    
    @Override
    public void play() {
        System.out.println("Now Playing: " + songName + " by " + artist);
    }
    
    @Override
    public void pause() {
        System.out.println("Paused: " + songName);
    }
    
    @Override
    public void stop() {
        System.out.println("Stopped: " + songName);
    }
}