package pl.agh.grupa2.psiocr.service;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import pl.agh.grupa2.psiocr.Language;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.net.URL;

@Service
@RequiredArgsConstructor
public class OCRService {


    private  final String DATAPATH = ("D:\\Java\\tessdata");

    public String doOCR(String url, String language) {

        try {
            URL imageFile = new URL(url);
            BufferedImage bufferedImage = ImageIO.read(imageFile);
            ITesseract instance = new Tesseract();
            instance.setDatapath(DATAPATH);
            instance.setLanguage(language);
            return instance.doOCR(bufferedImage);
        } catch (Exception e) {
            // TODO Exception handler
            e.printStackTrace();
        }
        return "";
    }

}
