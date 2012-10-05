package oleg.path;

import java.io.IOException;
import java.nio.file.FileStore;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.PosixFilePermissions;
import java.nio.file.attribute.UserPrincipal;

public class Metadata {

  public static void main(String[] args) throws IOException {
    final Path path = Paths.get("..");
    System.out
        .printf("path %s%n", path)
        .printf("path.toAbsolutePath %s%n", path.toAbsolutePath())
        .printf("toRealPath %s%n", path.toRealPath())

        .printf("path normalize %s%n", path.normalize())
        .printf("path.toAbsolutePath.normalize %s%n", path.toAbsolutePath().normalize())
        .printf("path.toRealPath.normalize %s%n", path.toRealPath().normalize())

        .printf("%s%n", PosixFilePermissions.toString(Files.getPosixFilePermissions(path)));


    final BasicFileAttributes attr = Files.readAttributes(path, BasicFileAttributes.class);

    System.out.printf("creationTime: %s%n", attr.creationTime())
        .printf("lastAccessTime: %s%n", attr.lastAccessTime())
        .printf("lastModifiedTime: %s%n", attr.lastModifiedTime())

        .printf("isDirectory: %s%n", attr.isDirectory())
        .printf("isOther: %s%n", attr.isOther())
        .printf("isRegularFile: %s%n", attr.isRegularFile())
        .printf("isSymbolicLink: %s%n", attr.isSymbolicLink())
        .printf("size: %s%n", attr.size());


    final UserPrincipal oleg = path.getFileSystem().getUserPrincipalLookupService().lookupPrincipalByName("oleg");

    System.out
        .printf("file owner: %s%n", oleg)
        .printf("file owner: %s%n", oleg.getClass());

    //file sotre
    final FileStore store = Files.getFileStore(path);
    long total = store.getTotalSpace() / 1024;
    long used = (store.getTotalSpace() - store.getUnallocatedSpace()) / 1024;
    long avail = store.getUsableSpace() / 1024;

    System.out
        .format("%-20s %12d %12d %12d\n", store.toString(), total, used, avail);
  }


}