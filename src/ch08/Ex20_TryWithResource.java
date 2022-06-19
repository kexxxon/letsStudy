package ch08;

public class Ex20_TryWithResource {
	public static void main(String[] args) {
		try(CloseableResource cr = new CloseableResource()) {
			cr.exceptionWork(false);	// 예외 발생 O
		} catch(WorkException e) {
			e.printStackTrace();
		} catch(CloseException e) {
			e.printStackTrace();
		}
		System.out.println();
		
		try(CloseableResource cr = new CloseableResource()) {
			cr.exceptionWork(true);	// 예외 발생 X
		} catch(WorkException e) {
			e.printStackTrace();
		} catch(CloseException e) {
			e.printStackTrace();
		}
	}
}

class CloseableResource implements AutoCloseable {
	public void exceptionWork(boolean exception) throws WorkException {
		System.out.println("exceptionWork(" + exception + ") 호출");
		
		if(exception)
			throw new WorkException("WorkException 발생");
	}
	
	public void close() throws CloseException {
		System.out.println("close() 호출");
		throw new CloseException("CloseException 발생");
	}
}

class WorkException extends Exception {
	WorkException(String msg) { super(msg); }
}

class CloseException extends Exception {
	CloseException(String msg) { super(msg); }
}