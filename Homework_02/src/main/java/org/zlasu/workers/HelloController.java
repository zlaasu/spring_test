package org.zlasu.workers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Controller
public class HelloController {

    @RequestMapping("/workers")
    public String workersAction(Model model) {
        Random random = new Random();
        List<Worker> workerList = readWorkers();
        Worker worker = workerList.get(random.nextInt(workerList.size()));

        model.addAttribute("worker", worker);

        return "workers";
    }

    private List<Worker> readWorkers() {
        List<Worker> workerList = new ArrayList<>();

        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader(
                    "C:\\zlasu\\workspace\\bootcamp_repo\\spring_test\\Homework_02\\Workers.txt"));
            String line = reader.readLine();
            while (line != null) {
                String row[] = line.split(", ");

                workerList.add(new Worker(Integer.parseInt(row[0]), row[1]));

                line = reader.readLine();
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return workerList;
    }
}
