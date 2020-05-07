package ${basePackage}.controller;
import ${basePackage}.domain.ResponseResult;
import ${basePackage}.pojo.${modelNameUpperCamel};
import ${basePackage}.service.${modelNameUpperCamel}Service;
import ${basePackage}.domain.PageResult;
import com.github.pagehelper.PageHelper;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by ${author} on ${date}.
*/
@RestController
@RequestMapping("${baseRequestMapping}")
public class ${modelNameUpperCamel}Controller {
    @Resource
    private ${modelNameUpperCamel}Service ${modelNameLowerCamel}Service;

    @PostMapping
    public ResponseResult add(@RequestBody ${modelNameUpperCamel} ${modelNameLowerCamel}) {
${modelNameLowerCamel}Service.save(${modelNameLowerCamel});
        return ResponseResult.ok();
    }

    @DeleteMapping("/{id}")
    public ResponseResult delete(@PathVariable Integer id) {
${modelNameLowerCamel}Service.deleteById(id);
        return ResponseResult.ok();
    }

    @PutMapping
    public ResponseResult update(@RequestBody ${modelNameUpperCamel} ${modelNameLowerCamel}) {
${modelNameLowerCamel}Service.update(${modelNameLowerCamel});
        return ResponseResult.ok();
    }

    @GetMapping("/{id}")
    public ResponseResult detail(@PathVariable Integer id) {
${modelNameUpperCamel} ${modelNameLowerCamel} = ${modelNameLowerCamel}Service.findById(id);
        return ResponseResult.ok(${modelNameLowerCamel});
    }

    @GetMapping
    public ResponseResult list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<${modelNameUpperCamel}> list = ${modelNameLowerCamel}Service.findAll();
        PageResult<${modelNameUpperCamel}> pageInfo = new PageResult<>(list);
        return ResponseResult.ok(pageInfo);
    }
}
