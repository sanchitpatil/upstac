package org.upgrad.upstac.testrequests.consultation;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;
import org.upgrad.upstac.config.security.UserLoggedInService;
import org.upgrad.upstac.testrequests.TestRequest;
import org.upgrad.upstac.users.User;

import javax.transaction.Transactional;
import java.time.LocalDate;

@Service
@Validated
public class ConsultationService {

    @Autowired
    private ConsultationRepository consultationRepository;

    @Autowired
    private UserLoggedInService userLoggedInService;

    private static Logger logger = LoggerFactory.getLogger(ConsultationService.class);


    @Transactional
    public Consultation assignForConsultation( TestRequest testRequest, User doctor) {
        Consultation consultation = new Consultation();
        consultation.setRequest(testRequest);
        consultation.setDoctor(doctor);
        consultationRepository.save(consultation);
        return consultation;

    }

    public Consultation updateConsultation(TestRequest testRequest , CreateConsultationRequest createConsultationRequest) {
        Consultation consultation = testRequest.getConsultation();
        consultation.setComments(createConsultationRequest.getComments());
        consultation.setSuggestion(createConsultationRequest.getSuggestion());
        consultation.setUpdatedOn(LocalDate.now());
        consultationRepository.save(consultation);
        return consultation;
    }


}
