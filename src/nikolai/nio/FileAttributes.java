package nikolai.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import java.nio.file.attribute.PosixFileAttributes;
import java.nio.file.attribute.PosixFilePermissions;
import java.nio.file.attribute.UserPrincipal;
import java.util.Date;

public class FileAttributes {
  public static void main(String[] args) throws IOException {
    Path path = Paths.get("xanadu.txt");

    long size = Files.size(path);
    System.out.println("size of xanadu.txt is: " + size);

    System.out.println("is Regular file" + Files.isRegularFile(path, LinkOption.NOFOLLOW_LINKS));
    System.out.println("is Hidden" + Files.isHidden(path));
    System.out.println("last modified time of xanadu.txt " + Files.getLastModifiedTime(path));

    System.out.println("\nAttributes: ");
    BasicFileAttributes attr = Files.readAttributes(path, BasicFileAttributes.class);

    System.out.println("creationTime: " + attr.creationTime());
    System.out.println("lastAccessTime: " + attr.lastAccessTime());
    System.out.println("lastModifiedTime: " + attr.lastModifiedTime());

    System.out.println("isDirectory: " + attr.isDirectory());
    System.out.println("isOther: " + attr.isOther());
    System.out.println("isRegularFile: " + attr.isRegularFile());
    System.out.println("isSymbolicLink: " + attr.isSymbolicLink());
    System.out.println("size: " + attr.size());

    FileTime time = FileTime.fromMillis(new Date().getTime());
    Files.setLastModifiedTime(path, time);

    System.out.println("\nPosix File Attributes");
    PosixFileAttributes posixAttr = Files.readAttributes(path, PosixFileAttributes.class);
    System.out.format("%s %s %s%n",
        posixAttr.owner().getName(),
        posixAttr.group().getName(),
        PosixFilePermissions.toString(posixAttr.permissions()));

    UserPrincipal owner = path.getFileSystem().getUserPrincipalLookupService().lookupPrincipalByName("rock_jam");
    Files.setOwner(path, owner);

  }
}
