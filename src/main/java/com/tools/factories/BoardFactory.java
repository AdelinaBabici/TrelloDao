package com.tools.factories;

import com.tools.models.Board;
import net.bytebuddy.utility.RandomString;

public class BoardFactory {
    public static Board getBoardInstance(){
        Board board = new Board();
        board.setName(RandomString.make(6));
        return board;
    }
}
