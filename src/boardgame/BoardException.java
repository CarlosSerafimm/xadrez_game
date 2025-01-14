package boardgame;

public class BoardException extends RuntimeException{
    private static final Long serialVersionUID = 1L;

    public BoardException(String msg){
        super(msg);
    }
}
