package Baitapday4.service;

import Baitapday4.dto.Worker;
import Baitapday4.service.WorkerService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WorkerService implements WorkerServiceInterface {

	@Override
	public List<Worker> insert(Scanner scanner) {
		List<Worker> workers = new ArrayList<>();
		System.out.print("Nhap vao so luong cong nhan: ");
		int total = scanner.nextInt();
		scanner.nextLine();
		for (int index = 0 ; index < total ; index++) {
			Worker worker = new Worker();
			worker.input(scanner, index);
			workers.add(worker);
		}
		return workers;
	}

	@Override
	public void show(List<Worker> workers) {
		int i = 0;
		for (Worker worker: workers) {
			worker.output(i);
			i++;
		}
	}

	@Override
	public List<Worker> delete(List<Worker> workers, Scanner scanner) {
		// TODO Auto-generated method stub
		return null;
	}
}