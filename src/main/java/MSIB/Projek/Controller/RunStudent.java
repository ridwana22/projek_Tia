package MSIB.Projek.Controller;

import MSIB.Projek.Entity.StudentData;
import org.springframework.web.bind.annotation.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Map;

@RestController
@RequestMapping("/api/student")
public class RunStudent {

    @PostMapping("/predict")
    public Map<String, String> predictStress(@RequestBody StudentData request) {
        StringBuilder output = new StringBuilder();
        try {
            String[] command = {
                    "C:\\Users\\LENOVO\\AppData\\Local\\Programs\\Python\\Python312\\python.exe",
                    "C:/Users/LENOVO/MSIB_Python/Projek/env/Projek_cmd.py",
                    String.valueOf(request.getStudyHoursPerDay()),
                    String.valueOf(request.getExtracurricularHoursPerDay()),
                    String.valueOf(request.getSleepHoursPerDay()),
                    String.valueOf(request.getSocialHoursPerDay()),
                    String.valueOf(request.getPhysicalActivityHoursPerDay()),
                    String.valueOf(request.getGpa())
            };

            ProcessBuilder processBuilder = new ProcessBuilder(command);
            processBuilder.redirectErrorStream(true);
            Process process = processBuilder.start();

            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line;
            while ((line = reader.readLine()) != null) {
                output.append(line).append("\n");
            }

            int exitCode = process.waitFor();
            if (exitCode != 0) {
                throw new RuntimeException("Python script failed with exit code " + exitCode + ": " + output);
            }

        } catch (Exception e) {
            e.printStackTrace();
            return Map.of(
                    "error", "Failed to execute Python script",
                    "details", e.getMessage()
            );
        }

        return Map.of(
                "output", output.toString(),
                "message", "Prediction successful!"
        );
    }
}
