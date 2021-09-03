package com.tests;

import com.tools.factories.BoardFactory;
import com.tools.models.Board;
import net.serenitybdd.junit.runners.SerenityRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SerenityRunner.class)
public class CrudCard extends BaseTest{

    @Test
    public void testCrudCard(){
        loginSteps.login();
        boardSteps.createBoard(BoardFactory.getBoardInstance());
        navigateToWorkspace();
        boardSteps.verifyBoardsNames();
        boardSteps.navigateToBoardPage(); //TODO



    }
}
