package com.tikqa.web.controller;

import com.automasi.nocodeautomation.model.dto.request.ExecuteRequest;
import com.automasi.nocodeautomation.model.dto.response.EventResponse;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping(value = "/v1/test-case")
@CrossOrigin("*")
public class ExecuteController {

    @PostMapping("/execute")
    public ResponseEntity<EventResponse> execute(@RequestBody ExecuteRequest eventRequest) {
        /* var browserName = scenarioRequest.getTestModel().getBrowserInfo().getBrowserName();
        var driver = browserService.create(browserName);
        driver.manage().window().maximize();
        for (TestStep testStep : scenarioRequest.getTestModel().getTestSteps()
        ) {
            var event = eventService.create(testStep);
            eventService.execute(event, driver);
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
           // driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        }
       /* WebElement ele = driver.findElement(By.xpath("/html/body/div[6]/header[1]/div/nav/div[3]/div[2]"));

       //Creating object of an Actions class
        Actions action = new Actions(driver);

       //Performing the mouse hover action on the target element.
        action.moveToElement(ele).perform();*/
        return null;
    }

}
