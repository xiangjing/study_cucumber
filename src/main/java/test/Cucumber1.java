package test;

import cucumber.api.PendingException;
import cucumber.api.java.zh_cn.����;
import cucumber.api.java.zh_cn.��;
import cucumber.api.java.zh_cn.��ô;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static junit.framework.Assert.assertEquals;


public class Cucumber1 {

    ToDoList td;
    stringadd sa;
    String she;

    @����("^�ҵ������嵥����(\\d+)������$")
    public void iHaveSomeTasks(int totalTasks) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        td = new ToDoList();
        td.setTotalTaskCount(totalTasks);
    }

    @��("^�����(\\d+)������֮��$")
    public void iFinishSomeTasks(int finishedTasks) throws Throwable {
        // Write code here that turns the phrase above into concrete action
        td.finishTask(finishedTasks);
    }

    @��ô("^�һ�ʣ��(\\d+)��δ��ɵ�����$")
    public void iLeftSomeTasks(int leftTasks) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        assertEquals(td.getRestTasksCount(), leftTasks);
    }

    //---------------�ڶ�������-------------------------------------------------//



    @��("^�ҵ����¼$")
    public void �ҵ����¼() throws Throwable {
        // Write code here that turns the phrase above into concrete action
        she=sa.he();
    }

    @����("^����һ���ַ���\"([^\"]*)\"$")
    public void ����һ���ַ���(String arg0) throws Throwable {
        sa = new stringadd();
        sa.jaishu(arg0);
    }

    @��("^�ҵڶ����ַ���\"([^\"]*)\"$")
    public void �ҵڶ����ַ���(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        sa.beijaishu(arg1);
    }

    @��ô("^��¼�ɹ�\"([^\"]*)\"$")
    public void ��¼�ɹ�(String arg2) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        she.equals(arg2);
    }

    //----------------------����������-----------------------------------

    @����("^Ihaveone\"([^\"]*)\"$")
    public void ihaveone(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        sa = new stringadd();
        sa.jaishu(arg0);
    }

    @��("^ihavetwo\"([^\"]*)\"$")
    public void ihavetwo(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        sa.beijaishu(arg0);

    }

    @��("^add$")
    public void add() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        she=sa.he();

    }

    @��ô("^cehnggong\"([^\"]*)\"$")
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

    @����("^i Have a url \"([^\"]*)\"$")
    public void iHaveAUrl(String arg0) throws Throwable {
         WebDriver dr =new FirefoxDriver();
        String url=arg0;
        dr.get(url);

    }
}

                               