package utils;


import com.cucumber.listener.Reporter;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import java.io.*;
import java.util.Date;

public class AdvanceReport extends DriverFactory {

    public static String returnDateStamp (String fileExtension){
        return new Date().toString().replace(":", "_").replace(" ", "_") + fileExtension;
    }

    public static void captureScreenshot () throws IOException {

        File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(srcFile, new File(System.getProperty("user.dir") + "/output/imgs/" + returnDateStamp(".jpg")));

        Reporter.addStepLog("Screenshot:");
        Reporter.addStepLog("<br>");
        Reporter.addStepLog("<a target=\"_blank\", href=" + returnScreenShotName() + "><img src=" + returnScreenShotName() + " height=200 width=300></img></a>");
    }

    public static String returnScreenShotName (){
        return System.getProperty("user.dir") + "/output/imgs/" + returnDateStamp(".jpg");
    }

    private static void copyFileUsingStream (File source, File destination) throws IOException{
        InputStream is = null;
        OutputStream os = null;

        try {
                is = new FileInputStream(source);
                os = new FileOutputStream(destination);

                byte[] buffer = new byte[1024];
                int length;

                while ((length = is.read(buffer)) > 0) {
                    os.write(buffer, 0, length);
                }

        }catch (Exception e){
            System.out.println("Issue Copying file: " + e.getMessage() );

        }finally {
                is.close();
                os.close();
        }
    }

    public static void copyLatestExtentReport() throws IOException{
        String date = new Date().toString().replace(":", "_").replace(" ", "_");
        File source = new File(System.getProperty("user.dir") + "/output/report.html");
        File dest = new File(System.getProperty("user.dir") + "/output/Report_" + date + ".html");

        if (source.exists()) {
            copyFileUsingStream(source, dest);
        }else {
            System.out.println("Report File doesn't exist or was not created");
        }
    }

}
