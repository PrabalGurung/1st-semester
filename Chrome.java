
/**
 * Write a description of class Chromw here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Chrome
{
        public static void main(String[] args){
           Chrome chrome = new Chrome();
           chrome.age = 4;
           chrome.setPassword("password");
           System.out.println("Password from facebook " +chrome.getPassword());
        }
        
        public void setPassword(String password){
            System.out.println("I am in chrome");
        }
    }
        


