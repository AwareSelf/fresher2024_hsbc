package layered.daointf;
import layered.exception.StudentNotFound;
import layered.model.*;

public interface DaoIntf {
	
	void saveStudent(Student s);
	Student getStudent(int studId) throws StudentNotFound;

}
