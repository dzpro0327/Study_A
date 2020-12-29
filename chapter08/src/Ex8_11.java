public class Ex8_11 {
    public static void main(String[] args) {
        try {
            startInstall();
        } catch (MemoryException me) {
            System.out.println("에러 메시지 : " + me.getMessage());
            me.printStackTrace();
        } catch (SpaceException se) {
            System.out.println("에러 메시지 : " + se.getMessage());
            se.printStackTrace();
            System.gc();
            System.out.println("다시 설치 하세요..");
        } finally {
            deleteTempFiles();
        }
    }

    public static void startInstall() throws SpaceException, MemoryException {
        if (!enoughSpace())
            throw new SpaceException("설치할 공간이 부족합니다.");
        if (!enoughMemory())
            throw new MemoryException("메모리가 부족합니다..");
    }

    static void copyFiles() {
    }

    static void deleteTempFiles() {
    }

    static boolean enoughSpace() {
        return false;
    }

    static boolean enoughMemory() {
        return true;
    }

}

class SpaceException extends Exception {
    SpaceException(String msg) {
        super(msg);
    }
}

class MemoryException extends Exception {
    MemoryException(String msg) {
        super(msg);
    }
}
