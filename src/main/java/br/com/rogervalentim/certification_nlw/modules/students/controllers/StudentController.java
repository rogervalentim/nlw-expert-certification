package br.com.rogervalentim.certification_nlw.modules.students.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.rogervalentim.certification_nlw.modules.students.dto.VerifyHasCertificationDTO;
import br.com.rogervalentim.certification_nlw.modules.students.useCases.VerifyIfHasCertificationUseCase;

@RestController
@RequestMapping("/students")
public class StudentController {
    
    @Autowired
    private VerifyIfHasCertificationUseCase verifyIfHasCertificationUseCase;
    
    @PostMapping("/verifyIfHasVerification")
    public String verifyIfHasCertification(@RequestBody VerifyHasCertificationDTO verifyHasCertificationDTO) {

        var result = this.verifyIfHasCertificationUseCase.execute(verifyHasCertificationDTO);
        if(result) {
            return "user has already taken the test";
        }

        return "User can do the test";
    }
}
