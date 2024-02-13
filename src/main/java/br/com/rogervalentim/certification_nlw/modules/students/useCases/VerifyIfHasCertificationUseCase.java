package br.com.rogervalentim.certification_nlw.modules.students.useCases;

import org.springframework.stereotype.Service;

import br.com.rogervalentim.certification_nlw.modules.students.dto.VerifyHasCertificationDTO;

@Service
public class VerifyIfHasCertificationUseCase {
    
    public boolean execute( VerifyHasCertificationDTO dto ) {
        if(dto.getEmail().equals("valentim.roger33@gmail.com") && dto.getTechnology().equals("JAVA")) {
            return true;
        }
           return false;
    }
}
