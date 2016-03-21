package test;

import cucumber.api.PendingException;
import cucumber.api.java.zh_cn.假设;
import cucumber.api.java.zh_cn.当;
import cucumber.api.java.zh_cn.那么;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static junit.framework.Assert.assertEquals;


public class Cucumber1 {

    ToDoList td;
    stringadd sa;
    String she;

    @假设("^我的任务清单里有(\\d+)个任务$")
    public void iHaveSomeTasks(int totalTasks) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        td = new ToDoList();
        td.setTotalTaskCount(totalTasks);
    }

    @当("^我完成(\\d+)件任务之后$")
    public void iFinishSomeTasks(int finishedTasks) throws Throwable {
        // Write code here that turns the phrase above into concrete action
        td.finishTask(finishedTasks);
    }

    @那么("^我还剩下(\\d+)件未完成的任务$")
    public void iLeftSomeTasks(int leftTasks) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        assertEquals(td.getRestTasksCount(), leftTasks);
    }

    //---------------第二个测试-------------------------------------------------//



    @当("^我点击登录$")
    public void 我点击登录() throws Throwable {
        // Write code here that turns the phrase above into concrete action
        she=sa.he();
    }

    @假设("^我有一个字符串\"([^\"]*)\"$")
    public void 我有一个字符串(String arg0) throws Throwable {
        sa = new stringadd();
        sa.jaishu(arg0);
    }

    @当("^我第二个字符串\"([^\"]*)\"$")
    public void 我第二个字符串(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        sa.beijaishu(arg1);
    }

    @那么("^登录成功\"([^\"]*)\"$")
    public void 登录成功(String arg2) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        she.equals(arg2);
    }

    //----------------------第三个例子-----------------------------------

    @假设("^Ihaveone\"([^\"]*)\"$")
    public void ihaveone(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        sa = new stringadd();
        sa.jaishu(arg0);
    }

    @当("^ihavetwo\"([^\"]*)\"$")
    public void ihavetwo(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        sa.beijaishu(arg0);

    }

    @当("^add$")
    public void add() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        she=sa.he();

    }

    @那么("^cehnggong\"([^\"]*)\"$")
    public void cehnggong(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions

        if (she.equals(arg0)) {
            System.out.print("good");
        }
        else{
            throw new PendingException();
        }
        ;
    }

    @假设("^i Have a url \"([^\"]*)\"$")
    public void iHaveAUrl(String arg0) throws Throwable {
         WebDriver dr =new FirefoxDriver();
        String url=arg0;
        dr.get(url);

    }
}

                               