package dev.patika.spring.api;

import dev.patika.spring.business.abstacts.ICustomerService;
import dev.patika.spring.Customer;
import dev.patika.spring.dto.CustomerResponse;
import dev.patika.spring.dto.CustomerSaveRequest;
import dev.patika.spring.dto.CustomerUpdateRequest;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

//Postman ile Rest API Temelleri
@RestController
@RequestMapping("/v1")
public class CustomerController {

    @Autowired
    private ICustomerService customerService;



    @Autowired
    private ModelMapper modelMapper;


    @GetMapping("/customers")
    @ResponseStatus(HttpStatus.OK)
    public List<CustomerResponse> findAll(){
        /*Manuel Yazımı
        List<CustomerDto> customerDtoList = this.customerService.findAll().stream().map(
                customer -> this.converter.convertDto(customer)
        ).collect(Collectors.toList());
         */

        List<CustomerResponse> customerResponseList = this.customerService.findAll().stream().map(
                customer -> this.modelMapper.map(customer, CustomerResponse.class)
        ).collect(Collectors.toList());
        return customerResponseList;
    }

    @PostMapping("/customers")
    @ResponseStatus(HttpStatus.CREATED)
    public Customer save(@RequestBody CustomerSaveRequest customerSaveRequest) {
        Customer newCustomer = this.modelMapper.map(customerSaveRequest, Customer.class);
        newCustomer.setOnDate(LocalDate.now());
        return this.customerService.save(newCustomer);
    }

    @PutMapping("/customers")
    @ResponseStatus(HttpStatus.OK)
    public Customer update(@RequestBody CustomerUpdateRequest customerUpdateRequest) {
        Customer updatedCustomer = this.customerService.getById(customerUpdateRequest.getId());
        updatedCustomer.setName(customerUpdateRequest.getName());
        updatedCustomer.setGender(customerUpdateRequest.getGender());
        return this.customerService.update(updatedCustomer);
    }

    @DeleteMapping("/customers/{id}")
    public void delete(@PathVariable("id") int id) {
        this.customerService.delete(id);
    }

    @GetMapping("/customers/{id}")
    @ResponseStatus(HttpStatus.OK)
    public CustomerResponse getById(@PathVariable("id") int id) {
        return this.modelMapper.map(this.customerService.getById(id), CustomerResponse.class);
    }

    // private final CustomerRepo customerRepo;


/*
    //Repository Katmanı
    public CustomerController(CustomerRepo customerRepo) {
        this.customerRepo = customerRepo;
    }

    @GetMapping("/{id}")
    public Customer findById(@PathVariable("id") int id) {
        return this.customerRepo.findById(id).orElseThrow();
    }

    @PostMapping("/save")
    public Customer save(@RequestBody Customer customer) {
        return this.customerRepo.save(customer);
    }

    @GetMapping("/find-all")
    public List<Customer> findAll(){
        return this.customerRepo.findAll();
    }

    @GetMapping("/mail/{mail}")
    public Customer findByMail(@PathVariable("mail") String mail) {
        return this.customerRepo.findByMail(mail);
    }
    @GetMapping("/find/{mail}/{gender}")
    public Customer findByMailAndGender(@PathVariable("mail") String mail,@PathVariable("gender") Customer.GENDER gender) {
        return this.customerRepo.findByMailAndGender(mail,gender);
    }
    @GetMapping("/find/{gender}")
    public List<Customer> findByGender(@PathVariable("gender") Customer.GENDER gender) {
        return this.customerRepo.getQueryByGender(gender);
    }

 */

    /*
    (IOC Uygulamaları)
    //Constructor Uygulaması

     // private final ICustomerService customerService;
    //Service(Business) Katmanı
    @Autowired
    public CustomerController(ICustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/{id}")
    public Customer getById(@PathVariable("id") int id) {
        return this.customerService.getById(id);
    }

    //Setter Uygulaması
    private ICustomerService customerService;

    @Autowired
    public void setCustomerService(ICustomerService customerService){
        this.customerService = customerService;
    }

    //Field Uygulaması
    @Autowired
    private ICustomerService customerService;

     */

}
