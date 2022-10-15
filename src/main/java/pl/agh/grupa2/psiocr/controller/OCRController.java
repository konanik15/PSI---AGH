package pl.agh.grupa2.psiocr.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import pl.agh.grupa2.psiocr.service.OCRService;

@RequiredArgsConstructor
@RestController
public class OCRController {

    private final OCRService ocrService;

    @PostMapping("/api/ocr")
    public String doOcr(@RequestBody String url,String langune) {
        return ocrService.doOCR(url,langune);
    }

    @GetMapping
    public String ok() {
        return "ok";
    }

}
