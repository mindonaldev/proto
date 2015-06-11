package mindonal.proto.controller;

import mindonal.proto.entity.Member;
import mindonal.proto.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by mindonal.dev@gmail.com on 6/11/15.
 */
@RestController
@RequestMapping("member")
public class MemberController {

    @Autowired
    private MemberRepository memberRepository;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public List<Member> getAllMembers() {
        List<Member> memberList = memberRepository.findAll();
        return memberList;
    }

    @RequestMapping(value = "/update", method = RequestMethod.GET)
    public List<Member> updateMembers() {
        List<Member> memberList = memberRepository.findAll();


        return memberList;
    }
}
