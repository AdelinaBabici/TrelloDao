package com.pages;

import com.tools.models.Board;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HomePage extends BasePage{
    public HomePage(WebDriver driver) {
        super(driver);
    }


    @FindBy(className = "_3pzxEn2Xy6S19b")
    WebElementFacade createButton;
    @FindBy(css = "button[data-test-id='header-create-board-button']")
    WebElementFacade createABoardButton;
    @FindBy(css = "button[data-test-id='create-board-submit-button']")
    WebElementFacade createBoardButton;
    @FindBy(css = "div[href='#']")
    WebElementFacade boardNameLabel;

    public void clickOnCreateButton(){
        clickOn(createButton);
    }
    public void clickOnCreateABoardButton(){
        clickOn(createABoardButton);
    }

    public void typeInBoardName(String name) {
        typeInInputWithPlaceholder("Add board title", name);

    }


    public void clickOnCreateBoardButton(){
        clickOn(createBoardButton);
    }

    public Board getBoardDetails(String name) {
        Board board = new Board();
        WebElement boardName = getBoardName(name);
        board.setName(boardName.getText());
        return board;
    }

    WebElement getBoardName(String name){
        List<WebElement> boards = getDriver().findElements(By.cssSelector("ul.boards-page-board-section-list > li"));
        System.out.println("********"+boards.toString() );
        for(WebElement board:boards){
            System.out.println("------"+board.getText());
            if(board.getText().equalsIgnoreCase(name)){
                return board;

            }
        }
        return null;

    }

    public void clickOnBoard(String name){
        System.out.println("board NAME is"+getBoardName(name).getText());
        getBoardName(name).click();
        }

    }


