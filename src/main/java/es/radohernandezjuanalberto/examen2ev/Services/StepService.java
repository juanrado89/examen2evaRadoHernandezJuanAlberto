package es.radohernandezjuanalberto.examen2ev.Services;

import es.radohernandezjuanalberto.examen2ev.repositories.StepRepository;
import org.springframework.stereotype.Service;

@Service
public class StepService {

    private StepRepository stepRepository;

    public StepService(StepRepository stepRepository) {
        this.stepRepository = stepRepository;
    }
}
