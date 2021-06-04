package application.DataManagement.File;

import application.DataManagement.DataManager;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.SQLException;

public class ProfilePhotoSaver
{
    public void writeProfilePhoto(String username, BufferedImage profilePhoto) throws IOException
    {
        File file = new File(System.getProperty("user.dir") + "\\ProfilePhotos\\" + username + ".jpg");
        FileOutputStream outputStream = new FileOutputStream(file);
        ImageIO.write(profilePhoto,"jpg",outputStream);
        outputStream.flush();
        outputStream.close();
    }
}
