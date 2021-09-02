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
        Assert.assertTrue("Name is not as expected!", expectedBoard.toString().equals(actualBoard.toString()));

    }

    @Step
    public void verifyBoardsNames(){
        waitABit(5000);
        List<Board> boards = boardDao.getAllBoards();
        for(Board board : boards){
            verifyBoardName(board.getName());
        }
    }



}
