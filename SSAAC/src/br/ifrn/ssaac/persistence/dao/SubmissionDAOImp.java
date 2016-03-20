package br.ifrn.ssaac.persistence.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.ifrn.ssaac.business.model.Submission;
import br.ifrn.ssaac.persistence.util.ConnectionFactory;

public class SubmissionDAOImp implements SubmissionDAO{

	private Connection conn;
	
	public SubmissionDAOImp() {
		conn = ConnectionFactory.getInstance().getConnection();
	}
	
	
	
	@Override
	public void addSubmission(Submission submission) {
		
		try{
			
			String sql = "INSERT INTO Submission (state) VALUES (?)";
			PreparedStatement pstInsere = conn.prepareStatement(sql);
			pstInsere.setString(1,submission.getState());
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
	}
	

	@Override
	public void GetSubmission(Submission submission) {
		
		try{
		String sql = "SELECT state FROM submission WHERE s.id = ?";
		PreparedStatement pstSelect = conn.prepareStatement(sql);
		pstSelect.setLong(1,submission.getId());
		pstSelect.execute();
		
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
