package com.uob.splcache;
import com.uob.splcache.service.CustomerService;
import com.uob.splcache.service.ManagerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class BatchApplication implements CommandLineRunner {
    @Autowired
    private ApplicationContext context;
    @Override
    public void run(String... jobNames) throws Exception {
        // Execute the first job
        for (String jobName : jobNames) {
            String []jobs = jobName.split("#");
            switch (jobs[0]) {
                case "MangerService":
                    ManagerService managerService = (ManagerService)context.getBean(jobs[0]);
                    if("MANAGER_KEY3".equals(jobs[1])) {
                        managerService.findAllManagers();
                    } else if("MANAGER_SECOND_KEY".equals(jobs[1])) {
                        managerService.findSecondAllManagers();
                    }
                    break;
                case "CustomerService":
                    CustomerService customerService = (CustomerService)context.getBean(jobs[0]);
                    customerService.findAllCustomers();
                    break;
                default:
                    throw new IllegalArgumentException("No such job: " + jobs[0]);
            }

        }

    }

/*    public List<Job> getJobs() throws NoSuchJobException {
        List<Job> jobs = new ArrayList<>();
        String[] jobNames = applicationContext.getBeanNamesForType(Job.class);
        for (String jobName : jobNames) {
            Job job = jobLocator.getJob(jobName);
            if (job != null) {
                jobs.add(job);
            }
        }
        return jobs;
    }*/

/*
    private Job getJob(String jobName) {
        switch (jobName) {
            case "orderItemJob":
                return job;
            case "customerJob":
                return job2;
            default:
                throw new IllegalArgumentException("No such job: " + jobName);
        }
    }
*/
}
