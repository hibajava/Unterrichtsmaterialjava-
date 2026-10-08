package aufgaben.lösung_9;

/**
 * Eigene Exception-Klasse
 */
class VideoException extends Exception
{
    private final Video video;

    public Video getVideo()
    {
        return video;
    }

    public VideoException(String message, Video video)
    {
        super(message);
        this.video = video;
    }

    @Override
    public String getMessage()
    {
        return super.getMessage() + "\n" + "Video: " + video;
    }
}
