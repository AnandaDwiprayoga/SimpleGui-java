/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
 *
 * @author PC
 */
public class TestRunner {
    public static void main(String[] args) {
        Result result = new JUnitCore().runClasses(UserTest.class);
        showMessageResult(result, UserTest.class.getSimpleName());
               
    }

    private static void showMessageResult(Result result, String simpleName) {
        if(result.wasSuccessful()){
            System.out.println("The Result TEst from " + simpleName + " : " + result.wasSuccessful());
        }else{
            for(Failure f : result.getFailures()){
                System.out.println(f);
            }
        }
    }
}
