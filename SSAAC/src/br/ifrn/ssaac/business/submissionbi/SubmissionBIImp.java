package br.ifrn.ssaac.business.submissionbi;
import br.ifrn.ssaac.business.model.Submission;
import br.ifrn.ssaac.persistence.dao.SubmissionDAO;
import br.ifrn.ssaac.persistence.dao.SubmissionDAOImp;

 
public class SubmissionBIImp implements SubmissionBI {

	
	private SubmissionDAO dao = new SubmissionDAOImp();
	
	
	
	@Override
	public void AddSubmission(Submission submission) {
		dao.addSubmission(submission);
		
	}
}
