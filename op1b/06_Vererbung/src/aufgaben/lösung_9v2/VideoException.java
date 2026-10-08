package aufgaben.lösung_9v2;

public class VideoException extends Exception
{
    private Video video;

    @Override
    public String getMessage()
    {
        return super.getMessage() + video;
    }

    public VideoException(String message, Video video)
    {
        super(message);
        this.video = video;
    }

    @Override
    public String toString()
    {
        return super.toString() + " " + video;
    }
}
