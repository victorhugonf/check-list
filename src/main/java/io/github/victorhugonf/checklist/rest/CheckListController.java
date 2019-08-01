package io.github.victorhugonf.checklist.rest;

import io.github.victorhugonf.checklist.dao.CheckListRepository;
import io.github.victorhugonf.checklist.jpa.CheckList;
import io.github.victorhugonf.checklist.rest.exception.CheckListNotFoundException;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/checklists")
public class CheckListController {

    private final CheckListRepository repository;

    public CheckListController(CheckListRepository repository){
        this.repository = repository;
    }

    @GetMapping
    public List<CheckList> all(){
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public CheckList byId(@PathVariable UUID id){
        return repository.findById(id).orElseThrow(() -> new CheckListNotFoundException(id));
    }

    @PostMapping
    public CheckList add(@RequestBody CheckList checkList){
        return repository.save(checkList);
    }

    @PutMapping("/{id}")
    public CheckList update(@RequestBody CheckList checkList, @PathVariable UUID id){
        return repository.findById(id).map(cl -> {
            cl.setName(checkList.getName());
            cl.setCheckList(checkList.getCheckList());
            return repository.save(cl);
        }).orElseGet(() -> {
            checkList.setId(id);
            return repository.save(checkList);
        });
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id){
        repository.deleteById(id);
    }

}
