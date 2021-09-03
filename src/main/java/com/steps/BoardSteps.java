package com.steps;

import com.dao.board.BoardDao;
import com.google.inject.Inject;
import com.pages.HomePage;
import com.tools.factories.BoardFactory;
import com.tools.models.Board;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

import java.util.List;

;

public class BoardSteps extends AbstractSteps{

    private HomePage homePage;
    @Inject
    private BoardDao boardDao;
    @Inject
    private  Board board;

    @Step
    public void createBoard(Board board){
     homePage.clickOnCreateButton();
     homePage.clickOnCreateABoardButton();
     waitABit(3000);
     homePage.typeInBoardName(board.getName());
     waitABit(2000);
     homePage.clickOnCreateBoardButton();
     boardDao.saveBoard(board);
    }
    @Step
    public void verifyBoardName(String name){
        Board expectedBoard = boardDao.getBoardByName(name);
        Board actualBoard = homePage.getBoardDetails(name);
        Assert.assertTrue("Board is not as expected!", expectedBoard.equals(actualBoard));

    }

    @Step
    public void verifyBoardsNames(){
        waitABit(5000);
        List<Board> boards = boardDao.getAllBoards();
        for(Board board : boards){
            verifyBoardName(board.getName());
        }
    }

    @Step
    public void navigateToBoardPage(){
        waitABit(5000);
        List<Board> boards = boardDao.getAllBoards();
        for(Board board : boards){
            System.out.println(board.getName());
            waitABit(3000);
            homePage.clickOnBoard(board.getName());
        }


    }



}
