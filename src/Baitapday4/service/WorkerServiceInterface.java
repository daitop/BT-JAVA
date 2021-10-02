package Baitapday4.service;

import Baitapday4.dto.Worker;

import java.util.List;
import java.util.Scanner;

public interface WorkerServiceInterface {
	List<Worker> insert(Scanner scanner);
	void show(List<Worker> workers);
	List<Worker> delete(List<Worker> workers, Scanner scanner);
}